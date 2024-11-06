import React from 'react'
import { Stack } from '@mui/material'
import ChatItem from '../shared/ChatItem'

const ChatList = ({w="100%",chats=[],chatId, onlineUsers=[], newMessageAlert = [{
    chatId:"",
    count:0,
},], handleDeleteChat,}) => {
  return  <Stack width={w} direction={"column"}>
    {
        chats?.map((data) =>{
            const {avatar, _id, name, groupChat, members} = data

            const isOnline = members?.some((member) => onlineUsers.includes(_id));
            const newMessageAlerts = newMessageAlert.find(({chatId}) => chatId === _id)
            return <ChatItem newMessageAlert={newMessageAlerts} isOnline={isOnline} avatar={avatar} name={name} _id={_id} key={_id} groupChat={groupChat} sameSender={chatId === _id}
            handleDeleteChat={handleDeleteChat}
            />
        })
    }
    </Stack>
  
}


export default ChatList