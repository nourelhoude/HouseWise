import express from "express";
import dist from "./routes/user.js";

let app = express();

app.use("/user", dist);

app.listen(3000, () => {
  console.log("waiting for req !");
});
