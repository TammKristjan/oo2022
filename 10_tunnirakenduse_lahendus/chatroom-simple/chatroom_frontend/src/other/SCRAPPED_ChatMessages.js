import { useState, useEffect } from "react";

function ChatMessages(url) {
    
    const [messages, setMessages] = useState([]);

    useEffect(() => {
        getMessages(url);
    }, []);

    useEffect(() => {
        const intervalID = setInterval(() => {
            getMessages(url);
        }, 3000);
        return () => clearInterval(intervalID);
    }, []);

    function getMessages(url) {
        fetch(url)
            .then(response => JSON.parse(response))
            .then(body => setMessages(body));
    }

    return (
    <div id="messagesContainer">
        {messages.map(message => <div id="messageBox"><div id="username" style={{color: message.userColor}}>{message.userName}</div><div id="message">{message.userMessage}</div></div>)}
    </div>
    );
}

export default ChatMessages;