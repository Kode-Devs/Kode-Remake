/*
 * Copyright 2022 Kode Devs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kodedevs.kode.tools;

import org.kodedevs.kode.KodeException;
import org.kodedevs.kode.core.CodeSource;
import org.kodedevs.kode.core.Lexer;
import org.kodedevs.kode.core.Token;
import org.kodedevs.kode.core.TokenType;

import java.util.Scanner;

public class Shell {

    private static final String DEFAULT_PROMPT = "kode> ";
    private static final String CMD_EXIT = "\\q";

    public void startShell() {
        // Scanner For User Input
        final Scanner sc = new Scanner(System.in);

        while (true) {
            // Print Prompt
            System.out.print(DEFAULT_PROMPT);

            // Read User Input
            final String input = sc.nextLine();

            // If Blank
            if (input.isBlank()) continue;

            // If EXIT
            if (input.equals(CMD_EXIT)) return;

            // Otherwise
            try {
                final CodeSource cs = CodeSource.fromRawString(input, true);
                final Lexer lexer = new Lexer(cs);

                for (; ; ) {
                    final Token token = lexer.scanNextToken();
                    System.out.println(token);
                    if (token.getTokenType() == TokenType.EOF) break;
                }
            } catch (KodeException k) {
                System.err.println(k.getLocalizedMessage());
            }
        }
    }
}