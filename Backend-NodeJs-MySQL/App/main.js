const express = require("express");
const app = express();
//const dotenv = require("dotenv");


app.use(express.json());
app.use(express.urlencoded({
    extended: true
}))

app.use((err, req, res, next) => {

    // This check makes sure this is a JSON parsing issue, but it might be
    // coming from any middleware, not just body-parser:

    if (err instanceof SyntaxError && err.status === 400 && 'body' in err) {
        let err = { "code": 400, "msg": "Invalid JSON" }
        return res.status(err.code).json(err); // Bad request
    }
    next();
});

//The following line, apparently is working but donot know exactly what is doing. 
app.use(express.static('public'))
app.use(require("../Routes/routes"))


//dotenv.config();

//Setting the port
const port = 3000;
app.listen(port, function(){
    console.log("listening on port "+ port)
})

