/* The following code was generated by JFlex 1.4 on 2/25/08 10:25 AM */

/*******************************************************************************
 * Copyright (c) 2004,2008 IBM Corporation, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     kb.huang  - Bug 214416  Dot char is not escaped in XML10Names.jFlex
 *******************************************************************************/
/*nlsXXX*/
package org.eclipse.wst.xml.core.internal.parser;




/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4
 * on 2/25/08 10:25 AM from the specification file
 * <tt>XML10Names.jflex</tt>
 */
public final class XML10Names {

  /** This character denotes the end of file */
  private static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 2048;

  /** lexical states */
  private static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\3\42\0\1\2\1\2\1\0\12\2\1\1\6\0\32\1"+
    "\4\0\1\1\1\0\32\1\74\0\1\2\10\0\27\1\1\0\37\1"+
    "\1\0\72\1\2\0\13\1\2\0\10\1\1\0\65\1\1\0\104\1"+
    "\11\0\44\1\3\0\2\1\4\0\36\1\70\0\131\1\22\0\7\1"+
    "\16\0\2\2\56\0\106\2\32\0\2\2\44\0\1\1\1\2\3\1"+
    "\1\0\1\1\1\0\24\1\1\0\54\1\1\0\7\1\3\0\1\1"+
    "\1\0\1\1\1\0\1\1\1\0\1\1\1\0\22\1\15\0\14\1"+
    "\1\0\102\1\1\0\14\1\1\0\44\1\1\0\4\2\11\0\65\1"+
    "\2\0\2\1\2\0\2\1\3\0\34\1\2\0\10\1\2\0\2\1"+
    "\67\0\46\1\2\0\1\1\7\0\46\1\12\0\21\2\1\0\27\2"+
    "\1\0\3\2\1\0\1\2\1\0\2\2\1\0\1\2\13\0\33\1"+
    "\5\0\3\1\56\0\32\1\5\0\1\2\12\1\10\2\15\0\12\2"+
    "\6\0\1\2\107\1\2\0\5\1\1\0\17\1\1\0\4\1\1\0"+
    "\1\1\17\2\2\1\2\2\1\0\4\2\2\0\12\2\u0207\0\3\2"+
    "\1\0\65\1\2\0\1\2\1\1\20\2\3\0\4\2\3\0\12\1"+
    "\2\2\2\0\12\2\21\0\3\2\1\0\10\1\2\0\2\1\2\0"+
    "\26\1\1\0\7\1\1\0\1\1\3\0\4\1\2\0\1\2\1\0"+
    "\7\2\2\0\2\2\2\0\3\2\11\0\1\2\4\0\2\1\1\0"+
    "\3\1\2\2\2\0\12\2\2\1\20\0\1\2\2\0\6\1\4\0"+
    "\2\1\2\0\26\1\1\0\7\1\1\0\2\1\1\0\2\1\1\0"+
    "\2\1\2\0\1\2\1\0\5\2\4\0\2\2\2\0\3\2\13\0"+
    "\4\1\1\0\1\1\7\0\12\2\2\2\3\1\14\0\3\2\1\0"+
    "\7\1\1\0\1\1\1\0\3\1\1\0\26\1\1\0\7\1\1\0"+
    "\2\1\1\0\5\1\2\0\1\2\1\1\10\2\1\0\3\2\1\0"+
    "\3\2\22\0\1\1\5\0\12\2\21\0\3\2\1\0\10\1\2\0"+
    "\2\1\2\0\26\1\1\0\7\1\1\0\2\1\2\0\4\1\2\0"+
    "\1\2\1\1\6\2\3\0\2\2\2\0\3\2\10\0\2\2\4\0"+
    "\2\1\1\0\3\1\4\0\12\2\22\0\2\2\1\0\6\1\3\0"+
    "\3\1\1\0\4\1\3\0\2\1\1\0\1\1\1\0\2\1\3\0"+
    "\2\1\3\0\3\1\3\0\10\1\1\0\3\1\4\0\5\2\3\0"+
    "\3\2\1\0\4\2\11\0\1\2\17\0\11\2\21\0\3\2\1\0"+
    "\10\1\1\0\3\1\1\0\27\1\1\0\12\1\1\0\5\1\4\0"+
    "\7\2\1\0\3\2\1\0\4\2\7\0\2\2\11\0\2\1\4\0"+
    "\12\2\22\0\2\2\1\0\10\1\1\0\3\1\1\0\27\1\1\0"+
    "\12\1\1\0\5\1\4\0\7\2\1\0\3\2\1\0\4\2\7\0"+
    "\2\2\7\0\1\1\1\0\2\1\4\0\12\2\22\0\2\2\1\0"+
    "\10\1\1\0\3\1\1\0\27\1\1\0\20\1\4\0\6\2\2\0"+
    "\3\2\1\0\4\2\11\0\1\2\10\0\2\1\4\0\12\2\221\0"+
    "\56\1\1\0\1\1\1\2\2\1\7\2\5\0\6\1\1\2\10\2"+
    "\1\0\12\2\47\0\2\1\1\0\1\1\2\0\2\1\1\0\1\1"+
    "\2\0\1\1\6\0\4\1\1\0\7\1\1\0\3\1\1\0\1\1"+
    "\1\0\1\1\2\0\2\1\1\0\2\1\1\0\1\1\1\2\2\1"+
    "\6\2\1\0\2\2\1\1\2\0\5\1\1\0\1\2\1\0\6\2"+
    "\2\0\12\2\76\0\2\2\6\0\12\2\13\0\1\2\1\0\1\2"+
    "\1\0\1\2\4\0\2\2\10\1\1\0\41\1\7\0\24\2\1\0"+
    "\6\2\4\0\6\2\1\0\1\2\1\0\25\2\3\0\7\2\1\0"+
    "\1\2\346\0\46\1\12\0\47\1\11\0\1\1\1\0\2\1\1\0"+
    "\3\1\1\0\1\1\1\0\2\1\1\0\5\1\51\0\1\1\1\0"+
    "\1\1\1\0\1\1\13\0\1\1\1\0\1\1\1\0\1\1\3\0"+
    "\2\1\3\0\1\1\5\0\3\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\3\0\2\1\3\0\2\1\1\0\1\1\50\0"+
    "\1\1\11\0\1\1\2\0\1\1\2\0\2\1\7\0\2\1\1\0"+
    "\1\1\1\0\7\1\50\0\1\1\4\0\1\1\10\0\1\1\u0c06\0"+
    "\234\1\4\0\132\1\6\0\26\1\2\0\6\1\2\0\46\1\2\0"+
    "\6\1\2\0\10\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\37\1\2\0\65\1\1\0\7\1\1\0\1\1\3\0\3\1\1\0"+
    "\7\1\3\0\4\1\2\0\6\1\4\0\15\1\5\0\3\1\1\0"+
    "\7\1\323\0\15\2\4\0\1\2\104\0\1\1\3\0\2\1\2\0"+
    "\1\1\121\0\3\1\u0e82\0\1\2\1\0\1\1\31\0\11\1\6\2"+
    "\1\0\5\2\13\0\124\1\4\0\2\2\2\0\2\2\2\0\132\1"+
    "\1\0\3\2\6\0\50\1\u1cd3\0\u51a6\1\u0c5a\0\u2ba4\1\u285c\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[4];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\4\0\10\0\14";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[4];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int ZZ_TRANS [] = {
    1, 2, 1, -1, -1, -1, -1, -1, 3, 2, 
    2, -1, 3, 3, 3, -1
  };

  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[4];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
        boolean result;
        /**
         * Creates a new scanner
         */
        public XML10Names() {
                this.zzReader = null;
        }

        public boolean isValidXML10Name(String stringToCheck) {
                boolean result = false;
                yyreset(new java.io.StringReader(stringToCheck));
                try {
                        result = isValidXML10Name();
                }
                catch (java.io.IOException e) {
                        // should be impossible with strings, but if occurs, just means
                        // "not"
                        result = false;
                }
                return result;
        }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public XML10Names(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public XML10Names(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1218) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  private final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  private final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  private final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  private final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  private final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  private final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  private final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean isValidXML10Name() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { return false; /* matched wild */
          }
        case 4: break;
        case 2: 
          { return true; /* exact name */
          }
        case 5: break;
        case 3: 
          { return false; /* more than name */
          }
        case 6: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { {return false; /* hit end with no match */} }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
