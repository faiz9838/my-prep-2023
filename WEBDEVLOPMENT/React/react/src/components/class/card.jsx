import React from "react"
import image from "../../assets/jocke-wulcan-KLOW1bD616Y-unsplash.jpg"
class Cards extends React.Component{
    render(){
        return (
            <div className="card-wrapper">
                <div className="card">
                    <div className="image-wrapper">
                        <img src={image} alt="" />
                    </div>
                     <div className="content-wrapper">
                        <div className="title">
                            <h2>This is title</h2>
                        </div>
                        <div className="para">
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi, nulla. Repellendus quos laudantium odio sed.</p>
                        </div>
                        <div className="btn-wrapper">
                            <button>Click Me</button>
                        </div>
                    </div>
                </div>
                <div className="card">
                    <div className="image-wrapper">
                        <img src={image} alt="" />
                    </div>
                    <div className="content-wrapper">
                        <div className="title">
                            <h2>This is title</h2>
                        </div>
                        <div className="para">
                           <p> Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi, nulla. Repellendus quos laudantium odio sed.</p>
                        </div>
                        <div className="btn-wrapper">
                            <button>Click Me</button>
                        </div>
                    </div>
                </div>
                
               
            </div>
        )
    }
}

export default Cards