const functions = require('firebase-functions');

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//
/*
function helloworld(abc, xyz) {
    console.log("helloworld " + abc);
    return xyz;
}
helloworld("abc", "abc");
*/

exports.helloWorld = functions.https.onRequest((request, response) => {
    response.send("Hello from Firebase!");
});



exports.xyz = functions.https.onRequest((request, response) => {
    response.send("Hello from Xyz function!");
});
