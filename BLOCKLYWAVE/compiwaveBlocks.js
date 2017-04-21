Blockly.Blocks['comment'] = {
  init: function() {
    this.appendDummyInput()
        .appendField("comment");
    this.appendValueInput("commentText")
        .setCheck("String");
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(45);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['string'] = {
  init: function() {
    this.appendDummyInput()
        .appendField("\"")
        .appendField(new Blockly.FieldTextInput(""), "stnInput")
        .appendField("\"");
    this.setOutput(true, "String");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['boolean'] = {
  init: function() {
    this.appendDummyInput()
        .appendField(new Blockly.FieldDropdown([["true","true"], ["false","false"]]), "blnInput");
    this.setOutput(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['int'] = {
  init: function() {
    this.appendDummyInput()
        .appendField(new Blockly.FieldNumber(0, -Infinity, Infinity, 1), "intInput");
    this.setOutput(true, "Number");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['float'] = {
  init: function() {
    this.appendDummyInput()
        .appendField(new Blockly.FieldNumber(0), "fltInput");
    this.setOutput(true, "Number");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['sum'] = {
  init: function() {
    this.appendValueInput("sum1")
        .setCheck("Number");
    this.appendValueInput("sum2")
        .setCheck("Number")
        .appendField("+");
    this.setInputsInline(true);
    this.setOutput(true, "Number");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['substract'] = {
  init: function() {
    this.appendValueInput("sub1")
        .setCheck("Number");
    this.appendValueInput("subs2")
        .setCheck("Number")
        .appendField("-");
    this.setInputsInline(true);
    this.setOutput(true, "Number");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['multiply'] = {
  init: function() {
    this.appendValueInput("mul1")
        .setCheck("Number");
    this.appendValueInput("mul2")
        .setCheck("Number")
        .appendField("*");
    this.setInputsInline(true);
    this.setOutput(true, "Number");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['divide'] = {
  init: function() {
    this.appendValueInput("div1")
        .setCheck("Number");
    this.appendValueInput("div2")
        .setCheck("Number")
        .appendField("/");
    this.setInputsInline(true);
    this.setOutput(true, "Number");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['lessthan'] = {
  init: function() {
    this.appendValueInput("less1")
        .setCheck("Number");
    this.appendValueInput("less2")
        .setCheck("Number")
        .appendField("<");
    this.setInputsInline(true);
    this.setOutput(true, "Boolean");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['morethan'] = {
  init: function() {
    this.appendValueInput("more1")
        .setCheck("Number");
    this.appendValueInput("more2")
        .setCheck("Number")
        .appendField(">");
    this.setInputsInline(true);
    this.setOutput(true, "Boolean");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['equals'] = {
  init: function() {
    this.appendValueInput("equal1")
        .setCheck("Number");
    this.appendValueInput("equal2")
        .setCheck("Number")
        .appendField("==");
    this.setInputsInline(true);
    this.setOutput(true, "Boolean");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['lessequals'] = {
  init: function() {
    this.appendValueInput("le1")
        .setCheck("Number");
    this.appendValueInput("le2")
        .setCheck("Number")
        .appendField("<=");
    this.setInputsInline(true);
    this.setOutput(true, "Boolean");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['moreequals'] = {
  init: function() {
    this.appendValueInput("me1")
        .setCheck("Number");
    this.appendValueInput("me2")
        .setCheck("Number")
        .appendField(">=");
    this.setInputsInline(true);
    this.setOutput(true, "Boolean");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['notequals'] = {
  init: function() {
    this.appendValueInput("ne1")
        .setCheck("Number");
    this.appendValueInput("ne2")
        .setCheck("Number")
        .appendField("!=");
    this.setInputsInline(true);
    this.setOutput(true, "Boolean");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['and'] = {
  init: function() {
    this.appendValueInput("and1")
        .setCheck("Boolean");
    this.appendValueInput("and2")
        .setCheck("Boolean")
        .appendField("&&");
    this.setInputsInline(true);
    this.setOutput(true, "Boolean");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['or'] = {
  init: function() {
    this.appendValueInput("or1")
        .setCheck("Boolean");
    this.appendValueInput("or2")
        .setCheck("Boolean")
        .appendField("||");
    this.setInputsInline(true);
    this.setOutput(true, "Boolean");
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['print'] = {
  init: function() {
    this.appendValueInput("printValue")
        .setCheck(null)
        .appendField("print");
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['varassign'] = {
  init: function() {
    this.appendValueInput("assign")
        .setCheck(null)
        .appendField(new Blockly.FieldTextInput(""), "name")
        .appendField("=");
    this.setInputsInline(true);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['function'] = {
  init: function() {
    this.appendValueInput("parameters")
        .setCheck(null)
        .appendField("function")
        .appendField(new Blockly.FieldDropdown([["int","int"], ["float","float"], ["string","string"], ["boolean","boolean"], ["void","void"]]), "functionType")
        .appendField(new Blockly.FieldTextInput(""), "NAME");
    this.appendStatementInput("content")
        .setCheck(null);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(270);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['parameter'] = {
  init: function() {
    this.appendValueInput("param")
        .setCheck(null)
        .appendField(new Blockly.FieldDropdown([["int","int"], ["float","float"], ["string","string"], ["boolean","boolean"], ["void","void"]]), "paramType")
        .appendField(new Blockly.FieldTextInput(""), "paramVar");
    this.setOutput(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['main'] = {
  init: function() {
    this.appendStatementInput("main")
        .setCheck(null)
        .appendField("main");
    this.setPreviousStatement(true, null);
    this.setColour(180);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['functioncall'] = {
  init: function() {
    this.appendValueInput("call")
        .setCheck(null)
        .appendField(new Blockly.FieldTextInput(""), "name")
        .appendField("(");
    this.appendDummyInput()
        .appendField(")");
    this.setInputsInline(true);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['while'] = {
  init: function() {
    this.appendValueInput("whileCall")
        .setCheck("Boolean")
        .appendField("while");
    this.appendStatementInput("whileLoop")
        .setCheck(null);
    this.setInputsInline(true);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(15);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['do'] = {
  init: function() {
    this.appendDummyInput()
        .appendField("do");
    this.appendStatementInput("doloop")
        .setCheck(null);
    this.appendValueInput("while")
        .setCheck("Boolean")
        .appendField("while");
    this.setInputsInline(true);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(15);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['if'] = {
  init: function() {
    this.appendValueInput("if")
        .setCheck("Boolean")
        .appendField("if");
    this.appendStatementInput("ifstatement")
        .setCheck(null);
    this.setInputsInline(true);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(135);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['ifelse'] = {
  init: function() {
    this.appendValueInput("if")
        .setCheck("Boolean")
        .appendField("if");
    this.appendStatementInput("ifstatement")
        .setCheck(null);
    this.appendStatementInput("else")
        .setCheck(null)
        .appendField("else");
    this.setInputsInline(true);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(135);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['parentesis'] = {
  init: function() {
    this.appendValueInput("parentesis")
        .setCheck(null)
        .appendField("(");
    this.appendDummyInput()
        .appendField(")");
    this.setInputsInline(true);
    this.setOutput(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['declaration'] = {
  init: function() {
    this.appendDummyInput()
        .appendField(new Blockly.FieldDropdown([["int","int"], ["float","float"], ["string","string"], ["boolean","boolean"], ["void","void"]]), "type")
        .appendField(new Blockly.FieldTextInput(""), "variable");
    this.appendValueInput("intValue")
        .setCheck(null)
        .appendField("=");
    this.setInputsInline(true);
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['paramcall'] = {
  init: function() {
    this.appendValueInput("param")
        .setCheck(null)
        .appendField(new Blockly.FieldTextInput(""), "value");
    this.setOutput(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['break'] = {
  init: function() {
    this.appendDummyInput()
        .appendField("line break");
    this.setPreviousStatement(true, null);
    this.setNextStatement(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['return'] = {
  init: function() {
    this.appendValueInput("return")
        .setCheck(null)
        .appendField("return");
    this.setPreviousStatement(true, null);
    this.setInputsInline(true);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.Blocks['variable'] = {
  init: function() {
    this.appendDummyInput()
        .appendField(new Blockly.FieldTextInput(""), "value");
    this.setOutput(true, null);
    this.setColour(230);
    this.setTooltip('');
    this.setHelpUrl('');
  }
};

Blockly.JavaScript['comment'] = function(block) {
  var value_commenttext = Blockly.JavaScript.valueToCode(block, 'commentText', Blockly.JavaScript.ORDER_ATOMIC);
  var code = '#' + value_commenttext + '\n';
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['string'] = function(block) {
  var text_stninput = block.getFieldValue('stnInput');
  var code = '"' + text_stninput + '"';
  // TODO: Change ORDER_NONE to the correct strength.
  return [code, Blockly.JavaScript.ORDER_NONE];
};


Blockly.JavaScript['boolean'] = function(block) {
  var dropdown_blninput = block.getFieldValue('blnInput');
  var code = dropdown_blninput;
  return code;
};

Blockly.JavaScript['int'] = function(block) {
  var number_intinput = block.getFieldValue('intInput');
  var code = number_intinput;
  // TODO: Change ORDER_NONE to the correct strength.
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['float'] = function(block) {
  var number_fltinput = block.getFieldValue('fltInput');
  var code = number_fltinput;
  // TODO: Change ORDER_NONE to the correct strength.
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['sum'] = function(block) {
  var value_sum1 = Blockly.JavaScript.valueToCode(block, 'sum1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_sum2 = Blockly.JavaScript.valueToCode(block, 'sum2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_sum1 + ' + ' + value_sum2 ;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['substract'] = function(block) {
  var value_sub1 = Blockly.JavaScript.valueToCode(block, 'sub1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_subs2 = Blockly.JavaScript.valueToCode(block, 'subs2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_sub1 + ' - ' + value_subs2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['multiply'] = function(block) {
  var value_mul1 = Blockly.JavaScript.valueToCode(block, 'mul1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_mul2 = Blockly.JavaScript.valueToCode(block, 'mul2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_mul1 + ' * ' + value_mul2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['divide'] = function(block) {
  var value_div1 = Blockly.JavaScript.valueToCode(block, 'div1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_div2 = Blockly.JavaScript.valueToCode(block, 'div2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_div1 + ' / ' + value_div2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['lessthan'] = function(block) {
  var value_less1 = Blockly.JavaScript.valueToCode(block, 'less1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_less2 = Blockly.JavaScript.valueToCode(block, 'less2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_less1 + ' < ' + value_less2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['morethan'] = function(block) {
  var value_more1 = Blockly.JavaScript.valueToCode(block, 'more1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_more2 = Blockly.JavaScript.valueToCode(block, 'more2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_more1 + ' > ' + value_more2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['equals'] = function(block) {
  var value_equal1 = Blockly.JavaScript.valueToCode(block, 'equal1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_equal2 = Blockly.JavaScript.valueToCode(block, 'equal2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_equal1 + ' == ' + value_equal2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['lessequals'] = function(block) {
  var value_le1 = Blockly.JavaScript.valueToCode(block, 'le1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_le2 = Blockly.JavaScript.valueToCode(block, 'le2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_le1 + ' <= ' + value_le2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['moreequals'] = function(block) {
  var value_me1 = Blockly.JavaScript.valueToCode(block, 'me1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_me2 = Blockly.JavaScript.valueToCode(block, 'me2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_me1 + ' >= ' + value_me2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['notequals'] = function(block) {
  var value_ne1 = Blockly.JavaScript.valueToCode(block, 'ne1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_ne2 = Blockly.JavaScript.valueToCode(block, 'ne2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_ne1 + ' != ' + value_ne2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['and'] = function(block) {
  var value_and1 = Blockly.JavaScript.valueToCode(block, 'and1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_and2 = Blockly.JavaScript.valueToCode(block, 'and2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_and1 + ' && ' + value_and2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['or'] = function(block) {
  var value_or1 = Blockly.JavaScript.valueToCode(block, 'or1', Blockly.JavaScript.ORDER_ATOMIC);
  var value_or2 = Blockly.JavaScript.valueToCode(block, 'or2', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = value_or1 + ' || ' + value_or2;
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['print'] = function(block) {
  var value_printvalue = Blockly.JavaScript.valueToCode(block, 'printValue', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = 'print¿'+ value_printvalue + '?;\n';
  code = code.replace(/[()]/g,'');
  return code;
};


Blockly.JavaScript['varassign'] = function(block) {
  var variable_name = Blockly.JavaScript.variableDB_.getName(block.getFieldValue('name'), Blockly.Variables.NAME_TYPE);
  var value_assign = Blockly.JavaScript.valueToCode(block, 'assign', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = variable_name + ' = ' + value_assign + ';\n';
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['function'] = function(block) {
  var dropdown_functiontype = block.getFieldValue('functionType');
  var text_name = block.getFieldValue('NAME');
  var value_parameters = Blockly.JavaScript.valueToCode(block, 'parameters', Blockly.JavaScript.ORDER_ATOMIC);
  var statements_content = Blockly.JavaScript.statementToCode(block, 'content');
  // TODO: Assemble JavaScript into code variable.
  var code = 'function ' + dropdown_functiontype + ' ' + text_name +
   '¿' + value_parameters + '? {\n' + statements_content + '}\n';
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['parameter'] = function(block) {
  var dropdown_paramtype = block.getFieldValue('paramType');
  var text_paramvar = block.getFieldValue('paramVar');
  var value_param = Blockly.JavaScript.valueToCode(block, 'param', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  if(value_param == ''){
    var code = dropdown_paramtype + ' ' + text_paramvar;
  }
  else{
    var code = dropdown_paramtype + ' ' + text_paramvar + ', ' + value_param;
  }
  // TODO: Change ORDER_NONE to the correct strength.
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['main'] = function(block) {
  var statements_main = Blockly.JavaScript.statementToCode(block, 'main');
  // TODO: Assemble JavaScript into code variable.
  var code = 'main{\n' + statements_main + '}\n';
  return code;
};

Blockly.JavaScript['functioncall'] = function(block) {
  var text_name = block.getFieldValue('name');
  var value_call = Blockly.JavaScript.valueToCode(block, 'call', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = text_name + '¿' +value_call + '?;\n';
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['while'] = function(block) {
  var value_whilecall = Blockly.JavaScript.valueToCode(block, 'whileCall', Blockly.JavaScript.ORDER_ATOMIC);
  var statements_whileloop = Blockly.JavaScript.statementToCode(block, 'whileLoop');
  // TODO: Assemble JavaScript into code variable.
  var code = 'while¿' + value_whilecall + '?{\n' + statements_whileloop +
  '}\n';
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['do'] = function(block) {
  var statements_doloop = Blockly.JavaScript.statementToCode(block, 'doloop');
  var value_while = Blockly.JavaScript.valueToCode(block, 'while', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = 'do{\n' + statements_doloop + '}while¿' + value_while + 
  '?\n';
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['if'] = function(block) {
  var value_if = Blockly.JavaScript.valueToCode(block, 'if', Blockly.JavaScript.ORDER_ATOMIC);
  var statements_ifstatement = Blockly.JavaScript.statementToCode(block, 'ifstatement');
  // TODO: Assemble JavaScript into code variable.
  var code = 'if¿' + value_if + '?{\n' + statements_ifstatement + '}\n';
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['ifelse'] = function(block) {
  var value_if = Blockly.JavaScript.valueToCode(block, 'if', Blockly.JavaScript.ORDER_ATOMIC);
  var statements_ifstatement = Blockly.JavaScript.statementToCode(block, 'ifstatement');
  var statements_else = Blockly.JavaScript.statementToCode(block, 'else');
  // TODO: Assemble JavaScript into code variable.
  var code = 'if¿' +value_if + '?{\n' + statements_ifstatement + 
  '}\n' + 'else{\n' + statements_else +'}\n';
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['parentesis'] = function(block) {
  var value_parentesis = Blockly.JavaScript.valueToCode(block, 'parentesis', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = '¿'+value_parentesis +'?';
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['declaration'] = function(block) {
  var dropdown_type = block.getFieldValue('type');
  var text_variable = block.getFieldValue('variable');
  var value_intvalue = Blockly.JavaScript.valueToCode(block, 'intValue', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  if(value_intvalue == ''){
    var code = dropdown_type + ' ' + text_variable + ';\n';
  }
  else {
    var code = dropdown_type + ' ' + text_variable + ' = ' + value_intvalue + ';\n';
  }
  code = code.replace(/[()]/g,'');
  return code;
};

Blockly.JavaScript['paramcall'] = function(block) {
  var text_value = block.getFieldValue('value');
  var value_param = Blockly.JavaScript.valueToCode(block, 'param', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  if(value_param == ''){
    var code = text_value;
  }
  else {
    var code = text_value + ', ' + value_param;
  }
  // TODO: Change ORDER_NONE to the correct strength.
  code = code.replace(/[()]/g,'');
  return [code, Blockly.JavaScript.ORDER_NONE];
};

Blockly.JavaScript['break'] = function(block) {
  // TODO: Assemble JavaScript into code variable.
  var code = '\n';
  return code;
};

Blockly.JavaScript['return'] = function(block) {
  var value_return = Blockly.JavaScript.valueToCode(block, 'return', Blockly.JavaScript.ORDER_ATOMIC);
  // TODO: Assemble JavaScript into code variable.
  var code = 'return ¿'+ value_return + '?;\n';
  return code;
};

Blockly.JavaScript['variable'] = function(block) {
  var text_value = block.getFieldValue('value');
  // TODO: Assemble JavaScript into code variable.
  var code = text_value;
  // TODO: Change ORDER_NONE to the correct strength.
  return [code, Blockly.JavaScript.ORDER_NONE];
};
