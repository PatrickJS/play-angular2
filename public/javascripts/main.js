console.log('ng', window.ng)



var App = ng.
  Component({
    selector: 'app'
  }).
  View({
    directives: [],
    template: 'hello angular 2 from play'
  }).
  Class({
    constructor: [function() {
      console.log('constructor');
    }]
  });

  ng.bootstrap(App);
