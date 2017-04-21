var express = require('express')
var app = express()

app.get('/', function (req, res) {
  res.sendFile('index.html', { root: __dirname });
})
app.get('/blockly_compressed.js', function (req, res) {
  res.sendFile('blockly_compressed.js', { root: __dirname });
})
app.get('/blocks_compressed.js', function (req, res) {
  res.sendFile('blocks_compressed.js', { root: __dirname });
})
app.get('/javascript_compressed.js', function (req, res) {
  res.sendFile('javascript_compressed.js', { root: __dirname });
})
app.get('/msg/js/en.js', function (req, res) {
  res.sendFile('msg/js/en.js', { root: __dirname });
})
app.get('/compiwaveBlocks.js', function (req, res) {
  res.sendFile('compiwaveBlocks.js', { root: __dirname });
})
app.get('/media/sprites.png', function (req, res) {
  res.sendFile('media/sprites.png', { root: __dirname });
})
app.get('/media/click.mp3', function (req, res) {
  res.sendFile('media/click.mp3', { root: __dirname });
})
app.get('/media/delete.mp3', function (req, res) {
  res.sendFile('media/delete.mp3', { root: __dirname });
})
app.get('/media/disconnect.wav', function (req, res) {
  res.sendFile('media/disconnect.wav', { root: __dirname });
})

app.get('/FileSaver.js', function (req, res) {
  res.sendFile('FileSaver.js', { root: __dirname });
})


app.listen(3000, function () {
  console.log('Example app listening on port 3000!')
})