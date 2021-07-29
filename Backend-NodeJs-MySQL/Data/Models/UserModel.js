const db = require("../DBConnection")
const tools = require("../tools")

class User {

    constructor(){}

    getUsers(req,res){
        db.query('SELECT * from users', (err, result) => {
            tools.queryResult(err,result,res)
        })
    }
}

module.exports = User