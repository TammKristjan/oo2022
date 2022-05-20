import { Route, Routes } from "react-router-dom";
import Navbar from "./other/NavBar";
import Chatroom from "./pages/Chatroom";
import UserPage from "./pages/UserPage";
import Archive from "./pages/Archive";

function Home() {
  return (
    <div>
        <Navbar/>
        <Routes>
          <Route path="chatroom" element={<Chatroom/>}/>
          <Route path="profile" element={<UserPage/>}/>
          <Route path="archive" element={<Archive/>}/>
        </Routes>
    </div>
  );
}

export default Home;