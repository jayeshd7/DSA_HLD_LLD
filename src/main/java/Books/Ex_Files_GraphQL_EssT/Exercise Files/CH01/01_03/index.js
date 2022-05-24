import express from 'express';

const app = express();

app.get('/', (req,res) => {
    res.send('Graphql is amazing!');
});

app.listen(8080, () => console.log('Running server on port localhost:8080/graphql'));
