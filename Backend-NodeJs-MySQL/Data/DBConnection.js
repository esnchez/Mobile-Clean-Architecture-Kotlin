const mysql = require("mysql");

const dotenv = require('dotenv')
dotenv.config()

const db = mysql.createConnection({
    host: 'localhost',
    user: 'Koobi',
    password: 'Koobi1234',
    database: 'Koobi'    
})

db.connect(function(err) {  
    if (err) throw err;  
    console.log("Connected!");  
  });  


module.exports = db




