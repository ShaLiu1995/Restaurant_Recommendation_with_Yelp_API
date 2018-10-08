var person = {
    name: 'John Doe',
    age: '20',
    greeting: function(greet) {
      console.log(greet + ' I am ' + this.name + 
                  ' and I am ' + this.age + ' years old.');
    },
    speak: function(a, b) {
      console.log('I am ' + this.name + ', ' + a + ' ' + b);
    }
};
  
person.greeting('Hi');
