import "./UserInput.css";
import User from "../other/UserClass";
import { useState } from "react";

function UserPage() {
    
    const user = new User();
    const [newName, setNewName] = useState(user.getName());
    const [newColor, setNewColor] = useState(user.getColor());

    function saveUserData() {
        console.log(newColor);
        user.setName(newName);
        user.setColor(newColor);
        user.sessionSave();
    }

    return (
        <div id="pageContent">
            <form>
                <label>Username</label>
                <input id="textInput" maxlength="30" type="text" value={newName} onChange={(event) => {
                    setNewName(event.target.value)
                }}/>
                <label>Name color</label>
                <input id="colorInput" type="color" value={newColor} onChange={(event) => {
                    setNewColor(event.target.value)
                }}/><br/>
                <button id="submitUserData" onClick={() => {
                    saveUserData();
                }}>Submit</button>
            </form>
        </div>
    )
}

export default UserPage;