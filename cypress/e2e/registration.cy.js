describe('Testing basic Angular registration', () => {
    beforeEach(()=>{
       cy.visit('http://localhost:2368/ghost/#/dashboard')
        cy.wait(7000)
       
    })
    it('Test links between registration and login page', () => {
        cy.get('#identification').type("somecodes56@gmail.com");
        cy.get('#password').type("elpollo56_56");
        cy.get('#ember5').click();
    })
    
  })