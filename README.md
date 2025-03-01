# News Aggregator API
### Brief
#### Requirements:
<ol> Set up a basic Spring Boot project with necessary dependencies (Spring Web, Spring Security, etc.).
<ol> Implement user registration and login using Spring Security with JWT for token-based authentication.
<ol> Use an in-memory database to store user information and their news preferences.
<ol> Implement a RESTful API with the following endpoints:
<ol> POST /api/register: Register a new user.
<ol> POST /api/login: Log in a user.
<ol> GET /api/preferences: Retrieve the news preferences for the logged-in user.
<ol> PUT /api/preferences: Update the news preferences for the logged-in user.
<ol> GET /api/news: Fetch news articles based on the logged-in user's preferences.
<ol> Use external news APIs (we have added few example APIs below) to fetch news articles from multiple sources. Utilize Spring's WebClient or RestTemplate for asynchronous HTTP requests.
<ol> Implement proper exception handling for invalid requests, authentication errors, and authorization errors.
<ol> Add input validation for user registration and news preference updates using Spring's validation annotations.
<ol> Test the API using Postman or Curl to ensure it works as expected.

Some external news APIs that may be helpful (they have some limits on their free tier plans):
NewsAPI - 100 requests/day (this one has a native Node.js library that is unmaintained since 2018. So it's better to consume the APIs directly)
NewsCatcher News API
GNews API - 100 requests/day
NewsAPI.ai - 2000 requests/month

Note: All of them require you to sign up for the API key.

