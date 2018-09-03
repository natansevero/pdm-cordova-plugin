cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
  {
    "id": "test-plugin.TestPlugin",
    "file": "plugins/test-plugin/www/test.js",
    "pluginId": "test-plugin",
    "clobbers": [
      "TestPlugin"
    ]
  }
];
module.exports.metadata = 
// TOP OF METADATA
{
  "cordova-plugin-whitelist": "1.3.3",
  "test-plugin": "0.0.1"
};
// BOTTOM OF METADATA
});