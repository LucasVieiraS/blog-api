## Bruno collection

This repo includes a Bruno collection under `docs/bruno/` so you can test the API quickly.

### Variables used

- **`baseUrl`**: API host (example: `http://localhost:8080`)
- **`token`**: JWT token from `POST /api/v1/auth/login` (used for admin endpoints)
- **`authorId`**: UUID of the user that will be used as the article author (required by `POST /api/v1/articles`)
- **`articleId` / `tagId` / `categoryId`**: IDs used by some requests

### Getting an admin token (for POST/PATCH/DELETE)

1) Seed an admin user by setting env vars before starting the API:

- `APP_ADMIN_USERNAME`
- `APP_ADMIN_EMAIL`
- `APP_ADMIN_PASSWORD`

2) Use the `Auth/Login` request to obtain a token, then copy it into the `token` variable in Bruno.

### Getting `authorId`

There is no “list users” endpoint in this API yet. To create an article, grab the user UUID from the DB.

Example SQL:

```sql
select id, username, role from users;
```
