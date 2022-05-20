class User {
    name;
    color;

    constructor() {
        if("user" in sessionStorage) {
            this.sessionLoad();
        } else {
            this.generateUserData();
        }
        this.sessionSave();
    }

    generateUserData() {
        const nameNumber = `${Math.floor(Math.random() * 10000)}`;
        this.name = `User${nameNumber.padStart(4, "0")}`;
        this.color = "#" + Math.floor(Math.random()*16777215).toString(16);
    }

    setName(name) {
        this.name = name;
    }

    setColor(color) {
        this.color = color;
    }

    getColor() {
        return this.color;
    }

    getName() {
        return this.name;
    }

    sessionSave() {
        sessionStorage.setItem("user", JSON.stringify(this));
    }

    sessionLoad() {
        const sessionData = JSON.parse(sessionStorage.getItem("user"));
        this.setName(sessionData.name);
        this.setColor(sessionData.color);
    }
}

export default User;