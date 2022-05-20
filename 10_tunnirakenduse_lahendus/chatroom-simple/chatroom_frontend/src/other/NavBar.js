import { Link } from "react-router-dom";

function Navbar() {
    return (
        <div>
            <header>
                <nav>
                    <Link to="chatroom">
                            Chatroom
                    </Link>
                    <Link to="profile">
                            User profile
                    </Link>
                    <Link to="archive">
                            Archive
                    </Link>
                </nav>
            </header>
        </div>
    )
}

export default Navbar;