var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var PythonShell = require('python-shell');
var fs = require('fs');
var tmp = require('tmp');

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

app.get('/wave.mp3', function (req, res) {
  res.sendFile('wave.mp3', { root: __dirname });
})

app.get('/FileSaver.js', function (req, res) {
  res.sendFile('FileSaver.js', { root: __dirname });
})

app.use(bodyParser.urlencoded({
    extended: true
}));
app.use(bodyParser.json());
app.post('/', function(req, res) {
  tmp.file({keep: true}, function _tempFileCreated(err, path, fd, cleanupCallback) {
    if (err) throw err;
    fs.writeFileSync(path, req.body.code);

    var options = {
      mode: 'text',
      pythonPath: '/usr/local/bin/python3',
      pythonOptions: ['-u'],
      scriptPath: './../gen',
      args: [path]
    };

    PythonShell.run('compiwaveBackbone.py', options, function (error, results) {
      if (error){
        cleanupCallback();
        res.send(error.message);
      }
      else{
        // results is an array consisting of messages collected during execution
        var resultString = "";

        for (var i = 0; i < results.length; i++) {
          resultString = resultString + results[i] + '\n';
        }
        res.send(resultString);
        cleanupCallback();
      }
    });
    
    // If we don't need the file anymore we could manually call the cleanupCallback 
    // But that is not necessary if we didn't pass the keep option because the library 
    // will clean after itself. 
  });
});


app.listen(3000,'0.0.0.0', function () {
  console.log('C O M P I W A V E 编译器 listening on port 3000!')
})