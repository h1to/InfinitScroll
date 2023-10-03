import React, { useState, useEffect } from 'react';
import InfiniteScroll from 'react-infinite-scroll-component';
import '../App.css';
import logo from '../logo.svg';
import { Card } from 'antd';
import { EditOutlined } from '@ant-design/icons';


const Scroll = () => {
    const [data, setData] = useState([]);
    const [page, setPage] = useState(1);
    const [more, setMore] = useState(false);

    const fetchData = async () => {
        // Fetch data from an API or any data source
        const response = await fetch(`http://localhost:9001/countries/all?page=${page}`);
        const newData = await response.json();

        setMore(!newData.last)
        setData([...data, ...newData.content]);
        setPage(page + 1);
    };

    useEffect(() => {
        fetchData();
    }, []);

    return (
        <InfiniteScroll
            dataLength={data.length}
            next={fetchData}
            hasMore={more}
            loader={<h4>Loading...</h4>} className="App App-header"
            endMessage={<p>No more data to load. Sorry))</p>}
        >
            <img src={logo} className="App-logo" alt="logo" />
            {/* Render your data */}
            {data.map((item, index) => (
                <div key={index} >
                    <Card title={item.name} bordered={false}
                          headStyle={{ color: 'white' }}
                          style={{ height: 313, width: 500, margin: 30, border: '2px solid #61dafb', backgroundColor: '#282c34', color: 'white', borderRadius: 10 }} key={index}
                          actions={[
                              <EditOutlined key="edit" />
                          ]}
                    >

                        <p>Population: {item.population}</p>
                        <p>Capital: {item.capital}</p>
                        <p>Area: {item.area}</p>
                        <p>Language: {item.language}</p>

                    </Card>
                </div>

            ))}
        </InfiniteScroll>
    );
};

export default Scroll;