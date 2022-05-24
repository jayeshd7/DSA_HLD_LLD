import { buildSchema } from 'graphql';

const schema = buildSchema(`
    type Friend {
        id: ID
        firstName: String
        lastName: String
        gender: String
        age: Int
        language: String
        email: String
    }

    type Query {
        getFriend(id: ID): Friend
    }

    input FriendInput {
        id: ID
        firstName: String!
        lastName: String
        gender: String
        age: Int
        language: String
        email: String
    }

    type Mutation {
        createFriend(input: FriendInput): Friend
    }
`)

export default schema;
