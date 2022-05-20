import { useEffect, useState, useRef } from "react";
import User from "../other/UserClass";
import "./Chatroom.css";

function Chatroom() {

    const user = new User();
    const [newMessage, setNewMessage] = useState("");
    const newMessageBox = useRef(null);
    const [messages, setMessages] = useState([]);

    useEffect(() => {
        getMessages("http://localhost:8080/messages");
    }, []);

    useEffect(() => {
        const intervalID = setInterval(() => {
            getMessages("http://localhost:8080/messages");
        }, 3000);
        return () => clearInterval(intervalID);
    }, []);

    function getMessages(url) {
        fetch(url)
            .then(response => response.json())
            .then(body => setMessages(body));
    }

    function submitMessage() {
        fetch("http://localhost:8080/send", {
            method: "POST",
            body: JSON.stringify(
                {
                    userName: user.getName(),
                    userColor: user.getColor(),
                    userMessage: newMessage,
                }),
            headers: {"Content-Type":"application/json"},
        })
            .then(response => response.json())
            .then(body => setMessages(body));
    };

    return (
        <div id="pageContent">
            <div id="messagesContainer">
                {messages.map(message => <div id="messageBox"><div id="username" style={{color: message.userColor}}>{message.userName}</div><div id="message">{message.userMessage}</div></div>)}
            </div>
            <div id="messageForm">
                <input ref={newMessageBox} id="messageText" type="text" value={newMessage} onChange={(event) => {
                    setNewMessage(event.target.value);
                }}></input>
                <button id="messageSubmit" onClick={() => {
                    submitMessage();
                    setNewMessage("");
                }}>&#62;</button>
            </div>
        </div>
    )
}

export default Chatroom;