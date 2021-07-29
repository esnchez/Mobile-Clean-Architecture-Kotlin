const express = require("express");
const app = express();
const dotenv = require("dotenv")
dotenv.config()


console.log("check "+ process.env.HOST)

// app.use(express.json());
// app.use(express.urlencoded({
//     extended: true
// }))

//Setting the port
const port = 3000;
app.listen(port, function(){
    console.log("listening on port "+ port)
})