package org.kodedevs.core.internal.token;

/**
 * Description of all the tokens.
 */
public enum TokenType {

    // Bracket.

    // Unary.

    // Binary.
    TOKEN_PLUS,
    TOKEN_MINUS,
    TOKEN_STAR,
    TOKEN_SLASH,
    TOKEN_BACKSLASH,
    TOKEN_MOD,
    TOKEN_POWER,
    TOKEN_LEFT_SHIFT,
    TOKEN_RIGHT_SHIFT,
    TOKEN_EQUAL_EQUAL,
    TOKEN_BANG_EQUAL,
    TOKEN_GREATER,
    TOKEN_GREATER_EQUAL,
    TOKEN_LESS,
    TOKEN_LESS_EQUAL,

    // Literals.
    TOKEN_IDENTIFIER,
    TOKEN_STRING,
    TOKEN_NUMBER,
    TOKEN_TRUE,
    TOKEN_FALSE,

    // Keyword.
    TOKEN_AND,
    TOKEN_OR,
    TOKEN_NOT,

    // Specials.
    TOKEN_SEMICOLON,
    TOKEN_ERROR,
    TOKEN_EOF, TOKEN_LEFT_PAREN, TOKEN_RIGHT_PAREN, TOKEN_LEFT_BRACE, TOKEN_RIGHT_BRACE, TOKEN_LEFT_SQUARE, TOKEN_RIGHT_SQUARE, TOKEN_COMMA, TOKEN_DOT,

    // Future.
}
