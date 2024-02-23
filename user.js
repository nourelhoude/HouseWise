export function add(req, res) {
  console.log("adding book done !");
  res.send("add is done !");
}

export function put(req, res) {
  console.log("update of book is done !");
  res.send("update done !");
}

export function del(req, res) {
  console.log("delete of book is done ! ");
  res.send("delete done !");
}
