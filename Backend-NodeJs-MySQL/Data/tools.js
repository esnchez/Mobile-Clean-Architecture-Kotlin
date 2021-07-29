module.exports = {
    queryResult : function(err, result, res, create) {
          //200 OK, 201 Created, 403 Forbidden, 500 Internal Server Error, 400 Bad Request
          if (err) {
            res.status(400).json(err);
            return;
        }
        
        let a = 200;
        if (create) {
            a = 201;
        }
        const answer = {
            data: null,
            status: a,
            error: null,
        }
        
        answer.data = result; //Result of the query
        res.status(answer.status).json(answer); //Server response (status and answer) 
    }
}