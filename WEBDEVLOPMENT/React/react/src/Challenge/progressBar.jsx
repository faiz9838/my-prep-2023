import React from 'react'
import styled from 'styled-components'

const ProgressBar = ({ percent = 10 }) => {
    const cappedPercent = Math.min(Math.max(0, percent), 100);

    return (
        <Wrapper data-testid="wrapper">
            <FilledBar data-testid="progress" percent={percent} />
        </Wrapper>
    );
};



const Wrapper = styled.div`
  width: 100%;
  height: 20px;
  border-radius: 5px;
  background-color: lightgrey;
`;

const FilledBar = styled.div`
  height: 100%;
  background-color: green;
  border-radius: 5px;
  width: ${props => props.percent}%;
`;
export default ProgressBar