import React from 'react';
import { BrowserRouter as Router, Route, Link, Navigate, Routes } from 'react-router-dom';
import Legislators from '../pages/legislator/Legislators';
import Bills from '../pages/bill/Bills';
import './AppRoute.css';

function AppRoute() {
    return (
      <Router>
        <div>
          <nav className="navbar">
            <ul className="navbar-nav">
              <li className="nav-item">
                <Link to="/legislators" className="nav-link">Legislators</Link>
              </li>
              <li className="nav-item">
                <Link to="/bills" className="nav-link">Bills</Link>
              </li>
            </ul>
          </nav>
          <Routes>
            <Route index element={<Legislators/>} />
            <Route path="/legislators" element={<Legislators/>} />
            <Route path="/bills" element={<Bills/>} />
          </Routes>        
        </div>
      </Router>
    );
  }
  
  export default AppRoute;