
import { Route, Routes } from 'react-router-dom'; // Link peab olema koos import
import './App.css';
import NavBar from './components/NavBar';
import Add from './pages/Add';
import Cart from './pages/Cart';
import Maintain from './pages/Maintain';
import Home from './pages/Home';

function App() {
  return (
    <div className="App">
      
      <NavBar />
      <Routes>
        <Route path="" element={ <Home /> }/>
        <Route path="lisa" element={ <Add /> }/>
        <Route path="halda" element={ <Maintain /> }/>
        <Route path="ostukorv" element={ <Cart /> }/>
      </Routes>
    </div>
  );
}

export default App;
