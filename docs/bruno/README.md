# Bruno collection

This repo includes a Bruno collection under `docs/bruno/` so you can test the API quickly.

## Variables used

- **`baseUrl`**: API host (example: `http://localhost:8080`)
- **`token`**: JWT token from `POST /api/v1/auth/login` (used for admin endpoints)
- **`authorId`**: UUID of the user that will be used as the article author (required by `POST /api/v1/articles`)
- **`articleId` / `tagId` / `categoryId`**: IDs used by some requests

## Getting an admin token (for POST/PATCH/DELETE)

If you don't set any `APP_ADMIN_*` env vars, the API will seed a default admin user on startup:

- username: `admin`
- email: `admin@example.com`
- password: `admin`

To override that default, set these env vars before starting the API:

- `APP_ADMIN_USERNAME`
- `APP_ADMIN_EMAIL`
- `APP_ADMIN_PASSWORD`

1) Use the `Auth/Login` request to obtain a token, then copy it into the `token` variable in Bruno.

## Getting `authorId`

Use the `GET /api/v1/users` endpoint to list users and copy the desired `id` into the `authorId` variable.
