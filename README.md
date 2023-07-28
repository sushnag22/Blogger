# REST API for a Blog
A REST API for a blog built with Spring Boot and Java. PostgreSQL is used as the database to store the blog posts and the comments to a post.

The two entities are:
1. `post` entity with attributes - 

      i. `id`
  
      ii. `title`

      iii. `content`

2. `comment` entity with attributes -

      i. `id`
      
      ii. `post_id`
      
      iii. `message`

The endpoints for posts are:

1. POST : /posts - Add a new blog post.
2. GET : /posts - Get all the blog posts.
3. GET : /posts/id - Get a blog post by id.
4. PUT : /posts/id - Updates a blog post with the given id.
5. DELETE : /posts/id - Delete a blog post with given id.

The endpoints for comments are:

1. POST : /posts/postid/comments - Adds a new comment to a blog post with given id.
2. GET : /posts/postid/comments - Get all the comments of a blog post with given id.
3. PUT : /posts/postid/comments - Updates the comment to a blog post with given id.
4. DELETE : /posts/postid/comments/id - Deletes the comment to a blog post with given id.

Postman Collection: https://api.postman.com/collections/17404613-7f51f8b7-5dd4-4958-adc4-47ec686f4db9?access_key=PMAT-01H6DSK8CSMQMHT41A19SQMY5K
