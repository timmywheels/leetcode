/**
 * @param {string[]} emails
 * @return {number}
 */

var emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"];

var numUniqueEmails = function(emails) {
    var alteredEmails = [];
    var count = 0;

    emails.map(email => {
        var splitEmail = email.split(/(@)/);
        var plusSymbol = email.indexOf('+');
        var periodSymbol = splitEmail[0].indexOf('.');

        if (plusSymbol > 0) {
            splitEmail[0] = splitEmail[0].slice(0, plusSymbol);
        }
        if (periodSymbol > 0) {
            splitEmail[0] = splitEmail[0].replace(/\./g, '')
        }

        splitEmail = splitEmail.join().replace(/,/g, '')
        alteredEmails.push(splitEmail)
    });
    return new Set(alteredEmails).size;
};

numUniqueEmails(emails);