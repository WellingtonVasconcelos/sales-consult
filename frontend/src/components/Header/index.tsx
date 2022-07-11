import logo from '../../assets/img/logo.svg';

import './styles.css';

function Header() {
    return (
        <header>
            <div className="salesconsult-logo-container">
                <img src={logo} alt="Sales Consult" />
                    <h1>Sales Consult</h1>
                    <p>
                        Desenvolvido por
                        <a href="https://github.com/WellingtonVasconcelos ">@WellingtonVasconcelos</a>
                    </p>
            </div>
        </header>
    )
}

export default Header;
