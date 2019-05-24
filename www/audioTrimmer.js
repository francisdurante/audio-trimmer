var exec = require('cordova/exec');

exports.showAudioTrimmer = function (arg0, success, error) {
    exec(success, error, 'audioTrimmer', 'showAudioEditor', [arg0]);
};
