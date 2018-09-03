var exec = require('cordova/exec')

var PLUGIN_NAME = 'TestPlugin'

module.exports = {
    test: function(arg, callbackSuccess, callbackError) {
        exec(callbackSuccess, callbackError, PLUGIN_NAME, 'test', [arg])
    }
}