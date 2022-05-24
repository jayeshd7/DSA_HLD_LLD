import express from 'express';
import { graphqlHTTP }  from 'express-graphql';
import { schema } from './data/schema';

const app = express();

app.get('/', (req, res) => {
    res.send('Graphql is amazing!');
});

app.use('/graphql', graphqlHTTP({
    schema: schema,
    graphiql: true,
}));

app.listen(8080, () => console.log('Running on server port localhost:8080/graphql'));
