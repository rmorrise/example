package example


import grails.dev.commands.*

class MyExampleCommand implements GrailsApplicationCommand {

    boolean handle() {
		System.out.println('Hello world!')
        return true
    }
}
