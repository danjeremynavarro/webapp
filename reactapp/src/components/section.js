import React from 'react';

export default class Section extends React.Component{
    /**
     * To do:
     * Add function to adjust properties of div
     */
    constructor(props){
        super(props);
        this.state = {
            shouldSlide: false
        }
    }

    render(){
        return (
            <div>
                {this.props.content}
            </div>
        )

    }
}