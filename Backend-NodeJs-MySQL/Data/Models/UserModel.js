const db = require("../DBConnection")
const tools = require("../tools")

class User {

    constructor(){}

    getUsers(req,res){
        db.query('SELECT * from users', (err, result) => {
            tools.queryResult(err,result,res)
        })
    }

    loginUser(req,res){
        db.query(`SELECT *  from users WHERE users.email = '${req.body.email}' and users.password = '${req.body.password}'`, (err, result) => {
            tools.queryResult(err,result,res)
        })
    }
}

module.exports = User