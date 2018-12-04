import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Just The Tip',

      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),

      home: CalculatorPage(title: 'Just The Tip'),
    );
  }
}

class CalculatorPage extends StatefulWidget {
  CalculatorPage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _CalculatorPageState createState() => _CalculatorPageState();
}

class _CalculatorPageState extends State<CalculatorPage> {
  void _handleFloatingActionButtonClick() {}

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),

      body: Center(child: Text('Hello World')),

      floatingActionButton: FloatingActionButton(
        onPressed: _handleFloatingActionButtonClick,
        tooltip: 'Increment',
        child: Icon(Icons.add),
      ),
    );
  }
}
