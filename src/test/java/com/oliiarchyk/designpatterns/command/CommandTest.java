package com.oliiarchyk.designpatterns.command;

import org.junit.jupiter.api.Test;

import java.util.List;

class CommandTest {

    @Test
    void commandExecuteAndRevertTest() {
        var commands = List.of(
                new DownloadFileCommand(),
                new ProcessFileCommand(),
                new UploadFileCommand());

        for (var command : commands) {
            command.execute();
        }
    }

}