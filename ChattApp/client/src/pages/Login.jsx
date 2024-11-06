import { Avatar, Button, Container, IconButton, Paper, Stack, TextField, Typography } from '@mui/material'
import React, { useState } from 'react'
import {CameraAlt as CameraAltIcon} from "@material-ui/icons"

import {  VisuallyHiddenInput } from '../components/styles/StyledComponents'
import {useFileHandler, useInputValidation, useStrongPassword} from '6pp'
import { usernameValidator } from '../utils/validators'


const Login = () => {

  const [isLogin, setLogin] = useState(true);
  const toggleLogin = () => setLogin((prev) => !prev);

  const name = useInputValidation("");
  const bio = useInputValidation("");
  const username = useInputValidation("", usernameValidator);
  const password = useStrongPassword();
  const avatar = useFileHandler("single");

  const handleLogin = (e) =>{
    e.preventDefault();
  }

  const handleSignUp = (e) =>{
    e.preventDefault();
  }

  
  return (
    <Container component={"main"} maxWidth="xs"  sx={{
      height:"100vh",
      display:"flex",
      alignItems:"center",
      justifyContent:"center",
      
    }}>
      <Paper elevation={2}
        sx = {
          {
            padding:"3rem",
            borderRadius:"0.5rem",
            display:"flex",
            margin:"auto",
            flexDirection: "column",
            alignItems: "center",
          }
        }>

       {
           isLogin ?( 
           <>
           <Typography variant='h5'>Login</Typography>

           <form style={{
            width:"100%",
            marginTop:"1rem",
           }}
            onSubmit={handleLogin}
           >


            {/* //username */}
            <TextField required fullWidth label="Username" margin='normal' variant='outlined'
            value={username.value}
            onChange={username.changeHandler}
            ></TextField>

          {/* //password */}
          <TextField required fullWidth label="Password" margin='normal' variant='outlined'
          value={password.value}
          onChange={password.changeHandler}
          ></TextField>

          {/* button */}
          <Button sx ={{
            marginTop:"1rem",
          }}
          fullWidth 
          variant='contained'
          
          type='submit'
          color='primary'
          >Login</Button>

          <Typography  sx={{
           marginTop:"1rem",
           textAlign:"center"
          }}>Or</Typography>
           {/* button */}
          <Button sx ={{
            marginTop:"1rem",
          }}
          fullWidth 
          variant='contained'
          color='secondary'
          onClick={toggleLogin}
          
          >Sign Up</Button>


           </form>
           </>
           ):(
          <>
           <Typography variant='h5'>Sign Up</Typography>

           <form style={{
            width:"100%",
            marginTop:"1rem",
           }}
           onSubmit={handleSignUp}
           
           >



            <Stack position={"relative"} width={"10rem"} margin={"auto"}>
            <Avatar 
            sx={{
              width:"10rem",
              height:"10rem",
              objectFit:"contain",
            }} 
            src={avatar.preview}
            />

            {
              avatar.error &&(
                <Typography margin={"1rem"} color="error" variant='caption'>
                  {avatar.error}
                </Typography>
              )
            }


            <IconButton
            sx={{
              position:"absolute",
              bottom:"0",
              right:"0",
              color:"lightblack",
              bgcolor:"lightgrey",
              ":hover":{
                bgcolor:"rgb(0,0,0,0,0.1)"
              }

            }}
            component="label"
            
            >
             <>
             <CameraAltIcon/>
              <VisuallyHiddenInput type='file' onChange={avatar.changeHandler}/>
            
             </>
            </IconButton>
            </Stack>

            {/* Name */}
             <TextField required fullWidth label="Name" margin='normal' variant='outlined'
             value={name.value}
             onChange={name.changeHandler}
             ></TextField>

            {/* Bio */}
              <TextField required fullWidth label="Bio" margin='normal' variant='outlined'
              value={bio.value}
              onChange={bio.changeHandler}
              ></TextField>


            {/* //username */}
            <TextField required fullWidth label="Username" margin='normal' variant='outlined'
            value={username.value}
            onChange={username.changeHandler}

            ></TextField>

            {
              username.error &&(
                <Typography color="error" variant='caption'>
                  {username.error}
                </Typography>
              )
            }

          {/* //password */}
          <TextField required fullWidth label="Password" margin='normal' variant='outlined'
          value={password.value}
          onChange={password.changeHandler}
          ></TextField>

          {
              password.error &&(
                <Typography color="error" variant='caption'>
                  {password.error}
                </Typography>
              )
            }


          {/* button */}
          <Button sx ={{
            marginTop:"1rem",
          }}
          fullWidth 
          variant='contained'
          
          type='submit'
          color='primary'
          >Sign Up</Button>

          <Typography  sx={{
           marginTop:"1rem",
           textAlign:"center"
          }}>Or</Typography>
           {/* button */}
          <Button sx ={{
            marginTop:"1rem",
          }}
          fullWidth 
          variant='contained'
          color='secondary'
          onClick={toggleLogin}
          
          >Login</Button>


           </form>
           </>
            )
       }
      </Paper>
    </Container>
  )
}

export default Login