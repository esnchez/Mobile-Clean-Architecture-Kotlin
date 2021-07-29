const express = require("express");
const router = express.Router();

const userModel = require("../Data/Models/UserModel");
const model = new userModel;


router.get("/users", (req,res) => {
    model.getUsers(req,res);
});


module.exports = router