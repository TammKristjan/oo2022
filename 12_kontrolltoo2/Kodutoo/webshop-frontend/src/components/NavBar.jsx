import { Link } from 'react-router-dom';
function NavBar() {
        return(
        <div>
            <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <div className="container-fluid">
            <Link to="/">
                <a className="navbar-brand">Veebipood</a>
            </Link>
                <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div className="navbar-nav">
                    <Link to="lisa">
                    <a className="nav-link">Lisa toode</a>
                    </Link>
                    <Link to="halda">
                    <a className="nav-link">Halda tooteid</a>
                    </Link>
                    <Link to="ostukorv">
                    <a className="nav-link">Ostukorvi</a>
                    </Link>
                </div>
                </div>
            </div>
            </nav>
        </div>)
}

export default NavBar;