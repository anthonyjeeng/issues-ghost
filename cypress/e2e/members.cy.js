
describe('Testing basic Ghost login', () => {
    it('Login to application', ()=>{
        cy.visit('http://localhost:2368/ghost/#/dashboard')
        cy.wait(3000)
        cy.get('#identification').type("somecodes56@gmail.com");
        cy.get('#password').type("elpollo56_56");
        cy.get('#ember5').click();
    })

    it('Oppening new member form', () => {
        cy.wait(3000)
        cy.get('[data-test-nav="members"]').click();
        cy.wait(3000)
        cy.url().should('include', 'http://localhost:2368/ghost/#/members');
        cy.contains('New member').click();
        cy.wait(3000)
    })

    it('Validating email type', () => {
        cy.url().should('include', 'http://localhost:2368/ghost/#/members/new');
        cy.get('[data-test-input="member-email"]').should('have.attr', 'type', 'email');
    })

})