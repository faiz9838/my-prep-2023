import React, { Suspense, useState } from 'react'
import {Box, AppBar, Toolbar, Typography, IconButton, Tooltip, Backdrop} from "@mui/material"
import { lazy } from 'react'

import { Menu as MenuIcon, Search as SearchIcon, Add as AddIcon, Group as GroupIcon, ExitToApp as LogoutIcon, Notifications as NotificationsIcon, Search } from "@material-ui/icons";


import {useNavigate} from "react-router-dom"


const SearchDialog = lazy(() => import("../specific/Search"))
const NotificationDialog = lazy(() => import("../specific/Notifications"))
const NewGroupDialog = lazy(() => import("../specific/NewGroup"))


const Header = () => {

    const navigate = useNavigate()

    // for clickable buttons in Appbar

    const [isMobile, setIsMobile] = useState(false);
    const [isSearch, setIsSearch] = useState(false);
    const [isNewGroup, setIsNewGroup] = useState(false);
    const [isNotification, setIsNotification] = useState(false);
    
   

    const handleMobile = () => {
       
        setIsMobile((prev) => !prev)
    }

     const openSearch = () => {
        
        setIsSearch((prev) => !prev)
    }

     const openNewGroup = () => {
      
        setIsNewGroup((prev) => !prev)
    }

     const openNotification = () => {
        
        setIsNotification((prev) => !prev)
    }

     const logoutHandler = () => {
        console.log("Logout Page")
    }

     const navigateToGroup = () => navigate("/groups")
       
  return (
   <>
   <Box sx={{flexGrow:1}} height={"4rem"}>
    <AppBar position='static' sx={{
        background:"darkgreen",
    }}>
    
    <Toolbar>

        <Typography 
            variant="h6"
            sx={{
                display:{xs:"none", sm:"block"},
            }}
        >
        WhatsApp
        </Typography>

        <Box  sx={{
                display:{xs:"block", sm:"none"},
            }}>
        <IconButton color="inherit"  onClick={handleMobile}>
        <MenuIcon/>

        </IconButton>
        </Box>
        <Box sx={{
           flexGrow:1,
        }}/>

        <Box>
            {/* search */}
            <IconBtn
            title="Search"
            icon={<SearchIcon/>}
            onClick={openSearch}
            />
       

        {/* Add icon */}

         <IconBtn
            title="New Group"
            icon={<AddIcon/>}
            onClick={openNewGroup}
            />
        
            {/* Manage Group     */}

             <IconBtn
            title="Manage Group"
            icon={<GroupIcon/>}
            onClick={navigateToGroup}
            />


            {/* Notification */}
             <IconBtn
            title="Notifications"
            icon={<NotificationsIcon/>}
            onClick={openNotification}
            />


             {/* Logout Header     */}

             <IconBtn
            title="Logout"
            icon={<LogoutIcon/>}
            onClick={logoutHandler}
            />
            
        </Box>
    </Toolbar>
    </AppBar>
   </Box>


   {
       isSearch && (
        <Suspense fallback={<Backdrop open/>}>
            <SearchDialog/>
        </Suspense>
       )}
   {
       isNotification && (
        <Suspense fallback={<Backdrop open/>}>
            <NotificationDialog/>
        </Suspense>
       )}
   {
       isNewGroup && (
        <Suspense fallback={<Backdrop open/>}>
            <NewGroupDialog/>
        </Suspense>
       )}
   </>





  )
}

// tolkit optimizer or iconbutton shortcut
const IconBtn = ({title, icon, onClick}) => {
    return (
        <Tooltip title={title}>
            <IconButton color='inherit' size='large' onClick={onClick}>
               {icon}
            </IconButton>
        </Tooltip>
    )
}


export default Header