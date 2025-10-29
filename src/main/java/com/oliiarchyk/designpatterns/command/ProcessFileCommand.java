package com.oliiarchyk.designpatterns.command;

public class ProcessFileCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Executing command - 'Process File'");
    }

    @Override
    public void revert() {
        System.out.println("Reverting command - 'Process File'");
    }
}
