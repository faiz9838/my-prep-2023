import React from 'react'
import Header from './Header'
import Title from '../shared/Title'
import {Grid} from "@mui/material"
import ChatList from '../specific/ChatList'
import { sampleChats } from '../constants/sampleData'
import { useParams } from 'react-router-dom'
const AppLayout = () => (WrappedComponent) => {
  return (props) =>{
    const params = useParams()
    const chatId = params.chatId;

    const handleDeleteChat = (e, _id, groupChat) =>{
      e.preventDefault()
      console.log("Delete chat", _id, groupChat)
    }
    return (
        <>
        <Title />
           <Header/>
              <Grid container height={"calc(100vh - 4rem)"}>

              <Grid item sm={4} md={3} sx={{display:{xs:"none", sm:"block"}}} height={"100%"} >
                <ChatList chats={sampleChats} 
              chatId={chatId} 
              handleDeleteChat={handleDeleteChat}
              onlineUsers={["1","2"]}
              /></Grid>

              <Grid item xs={12} sm={8} md={5} lg={6} padding={"0%"} height={"100%"} >
                 <WrappedComponent {...props}/>
              </Grid>

              <Grid item md={4} lg={3} sx={{
                display:{xs:"none", md:"block"},
               
              }} height={"100%"} >third</Grid>

              </Grid>


           
           
        </>
    )
  }
}

export default AppLayout