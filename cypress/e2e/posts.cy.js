import {faker} from '@faker-js/faker'
describe('Testing basic Ghost application', () => {
    beforeEach(()=>{
       cy.visit('http://localhost:2368/ghost/#/dashboard')
        cy.wait(3000)
       
    })
    it('Testing posts throught happy path', () => {
        cy.get('#identification').type("somecodes56@gmail.com");
        cy.get('#password').type("elpollo56_56");
        cy.get('#ember5').click();
        cy.get('.gh-nav-top').find('.gh-nav-manage').find('.gh-nav-list-new').find('.gh-nav-new-post').click();
        cy.get('.gh-editor-title').type('🅵🅶🅱🅳🅵🅱🅳🅱🅳🅱🅳🅱 adipiscing  adipiscing  adipiscing  adipiscing  adipiscing  adipiscing  adipiscing  adipiscing  adipiscing  adipiscing  adipiscing  adipiscing');
        cy.get('[data-koenig-dnd-droppable="true"]').invoke('text',faker.lorem.text());
        cy.get('.gh-publish-trigger').click();
        cy.get('[data-test-button="continue"]').click();
        cy.get('[data-test-button="confirm-publish"]').click();
        cy.get('[data-test-button="close-publish-flow"]').click();
        cy.get('[data-test-link="posts"]').click();
    })
    it('Testing posts throught unhappy path', () => {
        cy.get('#identification').type("somecodes56@gmail.com");
        cy.get('#password').type("elpollo56_56");
        cy.get('#ember5').click();
        cy.get('.gh-nav-top').find('.gh-nav-manage').find('.gh-nav-list-new').find('.gh-nav-new-post').click();
        cy.get('.gh-editor-title').type(faker.lorem.text());
        cy.get('[data-koenig-dnd-droppable="true"]').invoke('text',faker.lorem.text());
        cy.get('.gh-publish-trigger').click();
        cy.get('[data-test-button="continue"]').click();
        cy.get('[data-test-button="confirm-publish"]').click();
        cy.get('[data-test-button="close-publish-flow"]').click();
        cy.get('[data-test-link="posts"]').click();
        cy.viewport(280, 653);
    })

    it('Testing posts throught unhappy path', () => {
        cy.get('#identification').type("somecodes56@gmail.com");
        cy.get('#password').type("elpollo56_56");
        cy.get('#ember5').click();
        cy.get('.gh-nav-top').find('.gh-nav-manage').find('.gh-nav-list-new').find('.gh-nav-new-post').click();
        cy.get('.gh-publish-trigger').click();
        cy.get('[data-test-button="continue"]').click();
        cy.get('[data-test-button="confirm-publish"]').click();
        cy.get('[data-test-button="close-publish-flow"]').click();
        cy.get('[data-test-link="posts"]').click();
        
    })
  })