package com.oliiarchyk.designpatterns.command;

public class UploadFileCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Executing command - 'Upload File'");
    }

    @Override
    public void revert() {
        System.out.println("Reverting command - 'Upload File'");
    }
}
