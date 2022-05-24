import express from 'express';
import schema from './schema';
import graphqlHTTP from 'express-graphql';

const app = express();

app.get('/', (req,res) => {
    res.send('Graphql is amazing!');
});

class Friend {
    constructor(id, { firstName, lastName, gender, email}) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }
}

const friendDatabase = {};

const root = { 
    friend: () => {
        return {
            "id": 5658489489,
            "firstName": "Manny",
            "lastName": "Henri",
            "gender": "Male",
            "emails": [
                { email: "me@me.com" },
                { email: "another@me.com" } 
            ],
        }
    },
    createFriend: ({input}) => {
        let id = require('crypto').randomBytes(10).toString('hex');
        friendDatabase[id] = input;
        return new Friend(id, input);
    }
};

app.use('/graphql', graphqlHTTP({
    schema: schema,
    rootValue: root,
    graphiql: true,
}));

app.listen(8080, () => console.log('Running server on port localhost:8080/graphql'));
